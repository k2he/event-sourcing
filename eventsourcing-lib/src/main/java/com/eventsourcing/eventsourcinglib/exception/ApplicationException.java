package com.eventsourcing.eventsourcinglib.exception;

import com.eventsourcing.eventsourcinglib.util.CommonConstants;

/*
 * @author kaihe
 * 
 * Business Error, such as business logic validation failed, not able to perform any further action.
 * 
 */
public class ApplicationException extends BaseException {

    private static final long serialVersionUID = 1L;

    public ApplicationException(String serverStatusCode) {
        super(serverStatusCode, CommonConstants.APPLICATION_ERROR_DESCRIPTION, CommonConstants.APPLICATION_ERROR_SEVERITY);
    }

    public ApplicationException(String serverStatusCode, String statusDesc) {
        super(serverStatusCode, statusDesc, CommonConstants.APPLICATION_ERROR_SEVERITY);
    }
    
    public ApplicationException(String serverStatusCode, String statusDesc, AdditionalStatus.Severity severity) {
        super(serverStatusCode, statusDesc, severity);
    }
}

