package grails.helloword.rest

enum CommonApiRespCode implements ApiRespCode {
    OK(0, 'OK'),
    USED(1, 'Used'),
    VERIFICATION_CODE_MISMATCH(2, 'Verification code mismatch'),
    EXTERNAL_SERVER_ERROR(3, 'External server error'),
    NO_DATA(4, 'No Data'),
    TOKEN_INVALID(5, 'Token invalid'),
    NOT_ALLOWED(6, 'Not allowed'),
    INVALID_APP_VERSION(7, 'Invalid app version'),
    OPERATION_EXPIRED(8, 'Operation expired'),
    CONFIRMATION_REQUIRED(9, 'Confirmation required')

    private CommonApiRespCode(int code, String description) {
        this.code = code
        this.description = description
    }
}