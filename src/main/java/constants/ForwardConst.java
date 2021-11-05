package constants;

/**
 *
 * リクエストパラメータの変数名、変数値、jspファイルの名前等画面遷移に関わる値を定義するEnumクラス
 *
 */
public enum ForwardConst {

    // action
    ACT("action"),
    ACT_TOP("Top"),
    ACT_USER("User"),
    ACT_SCHE("Schedule"),
    ACT_AUTH("Auth"),

    // command
    CMD("command"),
    CMD_NONE(""),
    CMD_INDEX("index"),
    CMD_SHOW("show"),
    CMD_SHOW_LOGIN("showLogin"),
    CMD_LOGIN("login"),
    CMD_LOGOUT("logout"),
    CMD_NEW("entryNew"),
    CMD_CREATE("create"),
    CMD_EDIT("edit"),
    CMD_UPDATE("update"),
    CMD_DESTROY("destroy"),

    // jsp
    FW_ERR_UNKNOWN("error/unknown"),
    FW_TOP_INDEX("topPage/index"),
    FW_LOGIN("login/login"),
    FW_USER_INDEX("users/index"),
    FW_USER_SHOW("users/show"),
    FW_USER_NEW("users/new"),
    FW_USER_EDIT("users/edit"),
    FW_SCHE_INDEX("schedules/index"),
    FW_SCHE_SHOW("schedules/show"),
    FW_SCHE_NEW("schedules/new"),
    FW_SCHE_EDIT("schedules/edit");

    /**
     * 文字列
     */
    private final String text;

    /**
     * コンストラクタ
     */
    private ForwardConst(final String text) {
        this.text = text;
    }

    /**
     * 値(文字列)取得
     */
    public String getValue() {
        return this.text;
    }

    /**
     * 値(文字列)から、該当する定数を返却する
     * (例："Schedule"→ForwardConst.ACT_SCHE)
     * @param 値(文字列)
     * @return ForwardConst型定数
     */
    public static ForwardConst get(String key) {
        for(ForwardConst c : values()) {
            if(c.getValue().equals(key)) {
                return c;
            }
        }

        return CMD_NONE;
    }
}
