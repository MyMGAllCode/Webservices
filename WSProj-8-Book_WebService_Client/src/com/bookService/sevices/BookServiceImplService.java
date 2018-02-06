/**
 * BookServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookService.sevices;

public interface BookServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getBookServiceImplAddress();

    public com.bookService.sevices.BookServiceImpl getBookServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.bookService.sevices.BookServiceImpl getBookServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
