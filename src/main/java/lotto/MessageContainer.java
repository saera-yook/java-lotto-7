package lotto;

import static lotto.domain.LottoConstants.COUNT_OF_LOTTO_NUMBERS;
import static lotto.domain.LottoConstants.MAX_LOTTO_NUMBER;
import static lotto.domain.LottoConstants.MIN_LOTTO_NUMBER;
import static lotto.view.ViewConstants.VIEW_DELIMITER_LABEL;

public class MessageContainer {
    public static final String ENTER_PURCHASE_AMOUNT = "구입 금액을 입력해 주세요.";
    public static final String ENTER_WINNING_LOTTO_NUMBERS
            = String.format("당첨 번호를 입력해 주세요.(번호는 %s 기준으로 구분)", VIEW_DELIMITER_LABEL);

    public static final String ERROR_LABEL = "[ERROR]";

    public static final String NEITHER_DIGIT_NOR_DELIMITER_ERROR
            = String.format("%s 숫자와 %s만 입력해야 합니다.", ERROR_LABEL, VIEW_DELIMITER_LABEL);
    public static final String COUNT_OF_LOTTO_NUMBERS_ERROR
            = String.format("%s 로또 번호는 %s개여야 합니다.", ERROR_LABEL, COUNT_OF_LOTTO_NUMBERS);
    public static final String DUPLICATE_NUMBER_ERROR
            = String.format("%s 로또 번호는 중복되지 않아야 합니다.", ERROR_LABEL);
    public static final String OUT_OF_RANGE_NUMBER_ERROR
            = String.format("%s 로또 번호는 %d부터 %d 사이의 숫자여야 합니다.", ERROR_LABEL, MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER);
}
