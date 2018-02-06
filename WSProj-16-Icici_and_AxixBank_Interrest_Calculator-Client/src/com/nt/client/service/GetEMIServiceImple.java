/**
 * 
 */
package com.nt.client.service;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.axis.service.AxisBankServiceImpl;
import com.axis.service.AxisBankServiceImplServiceLocator;
import com.icici.service.IciciServiceImpl;
import com.icici.service.IciciServiceImplServiceLocator;
import com.nt.bo.GetEMIBO;

/**
 * @author DKP
 *
 */
public class GetEMIServiceImple implements GetEMIService {


	Double axisIneterest=0.0,iciciIneterest=0.0, amount,emi;
	int time=0;
	@Override
	public EMIDetails getEmiDetail(GetEMIBO bo) {
		EMIDetails emiDetails=new EMIDetails();
		
		if(bo.getBank().equalsIgnoreCase("Axis")){
		///Axis Bank Business Logic 
		
		AxisBankServiceImplServiceLocator locator=new AxisBankServiceImplServiceLocator();
		try {
		AxisBankServiceImpl sei=locator.getAxisBankServiceImpl();
		axisIneterest=sei.getInstance();
			
		} //tryend
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch end
		catch(ServiceException se){
			se.printStackTrace();
		
		}//catch end
		
	//Get Value from BO	
	amount=bo.getAmt();
	time=bo.getTime();
	
	/// Calculate  EMI Using Time and Interest
emi=	(amount+(amount*time*axisIneterest/(100.0*12)))/time;

///Setting Datainto EMIDetails Obj
emiDetails.setAmt(bo.getAmt());
emiDetails.setBank(bo.getBank());
emiDetails.setInterestrate(axisIneterest);
emiDetails.setEmi(emi);
emiDetails.setTime(bo.getTime());
/////////////////////	

	}//IF end 

	else if(bo.getBank().equalsIgnoreCase("ICICI")){
		//ICIC Bank Logic Here 
		///Getting Services from Service Provider
		
		IciciServiceImplServiceLocator locator =new IciciServiceImplServiceLocator();

		try {
		IciciServiceImpl sei=locator.getIciciServiceImpl();
		
			iciciIneterest=sei.getInstance();
		}//try end 
		
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// catch end 
		catch(ServiceException se){
			se.printStackTrace();
		}//catch End 
		
		amount=bo.getAmt();
		time=bo.getTime();
		// Calculate EMI using time and Interest 
		emi=	(amount+(amount*time*iciciIneterest/(100.0*12)))/time;
		
		// Setting data into EMIDetails 
		emiDetails.setAmt(bo.getAmt());
		emiDetails.setBank(bo.getBank());
		emiDetails.setInterestrate(iciciIneterest);
		emiDetails.setEmi(emi);
		emiDetails.setTime(bo.getTime());
		
	}//end if-else 
	else {
		
		emiDetails.setBank("Bank Not Selected ");
		emiDetails.setAmt(bo.getAmt());
		emiDetails.setEmi(0.0);
		emiDetails.setInterestrate(0.0);
		emiDetails.setTime(bo.getTime());
		
	
		
	}//end Else 
	
	
		return 	emiDetails;
	}

}
