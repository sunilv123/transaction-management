/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 3:56 PM
 * Project Name: practice
 */

package com.practice.exception;

public class CustomException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CustomException(String msgCode) {
        super(msgCode);
    }

}
