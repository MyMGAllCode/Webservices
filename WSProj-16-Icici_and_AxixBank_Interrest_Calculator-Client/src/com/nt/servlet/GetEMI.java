package com.nt.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nt.bo.GetEMIBO;
import com.nt.client.service.EMIDetails;
import com.nt.client.service.GetEMIServiceImple;

public class GetEMI extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String bank=null,amt=null,time=null;
		bank=req.getParameter("bank");
		amt=req.getParameter("amt");
		time=req.getParameter("time");
		GetEMIBO bo=new GetEMIBO();
		bo.setAmt(Double.parseDouble(amt));
		bo.setTime(Integer.parseInt(time));
		bo.setBank(bank);
		
		
		
		EMIDetails details =new GetEMIServiceImple().getEmiDetail(bo);
		System.out.println(details);
		HttpSession ses=req.getSession();
	
	ses.setAttribute("details", details );
	RequestDispatcher rd=req.getRequestDispatcher("/pages/emidetail.jsp");
	rd.forward(req, res);
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
