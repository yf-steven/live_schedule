package constants;

/**
 *
 * 画面の項目値等を定義するEnumクラス
 *
 */

public enum AttributeConst {

    // フラッシュメッセージ
    FLUSH("flush"),

    // 一覧画面共通
    MAX_ROW("maxRow"),
    PAGE("page"),

    // 入力フォーム共通
    TOKEN("_token"),
    ERR("errors"),

    // ログイン中のユーザー
    LOGIN_USER("login_user"),

    // ログイン画面
    LOGIN_ERR("loginError"),

    // ユーザー管理
    USER("user"),
    USERS("users"),
    USER_COUNT("users_count"),
    USER_ID("id"),
    USER_EMAIL("email"),
    USER_PASS("password"),
    USER_NICKNAME("nickname"),

    // スケジュール管理
    SCHEDULE("schedule"),
    SCHEDULES("schedules"),
    SCHE_COUNT("schedules_count"),
    SCHE_ID("id"),
    SCHE_DATE("schedule_date"),
    SCHE_TITLE("title"),
    SCHE_ARTIST("artist"),
    SCHE_PLACE("place"),
    SCHE_MEMO("memo");

    private final String text;
    private final Integer i;

    private AttributeConst(final String text) {
        this.text = text;
        this.i = null;
    }

    private AttributeConst(final Integer i) {
        this.text = null;
        this.i = i;
    }

    public String getValue() {
        return this.text;
    }

    public Integer getIntegerValue() {
        return this.i;
    }

}
