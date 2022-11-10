package lotto.common;

public enum InputErrors {
    BLANK("빈 값은 요청될 수 없습니다."),
    AMOUNT_NOT_NUMBER("구입 금액은 구분자 없는 숫자만 가능합니다."),
    AMOUNT_UNDER_MINIMUM("구입 금액은 한 장의 가격보다 크거나 같아야 합니다."),
    AMOUNT_OVER_LIMIT("구입 금액은 구매 한도를 넘을 수 없습니다."),
    AMOUNT_NOT_DIVIDABLE("구입 금액은 한 장의 가격으로 나누어 떨어져야 합니다");

    private String message;
    InputErrors(String message) {
        String errorPrefix = "[ERROR]";
        this.message = errorPrefix + message;
    }

    public String getMessage() {
        return message;
    }
}
