package constants;

/**
 *
 * 各出力メッセージを定義するEnumクラス
 *
 */

public enum MessageConst {

    // 認証
    I_LOGINED("ログインしました"),
    E_LOGINED("ログインに失敗しました"),
    I_LOGOUT("ログアウトしました"),

    // DB更新
    I_REGISTERED("登録が完了しました"),
    I_UPDATED("更新が完了しました"),
    I_DELETED("削除が完了しました"),

    // バリデーション
    E_NO_NICKNAME("ニックネームを入力してください"),
    E_NO_PASSWORD("パスワードを入力してください"),
    E_NO_EMAIL("Emailを入力してください"),
    E_NO_ARTIST("アーティストを入力してください"),
    E_NO_TITLE("タイトルを入力してください"),
    E_NO_TEXT("本文を入力してください"),
    E_NO_DATE("日付を入力してください"),
    E_NICKNAME_EXIST("入力されたニックネームは既に存在しています"),
    E_EMAIL_EXIST("入力されたEmailは既に存在しています");

    /**
     * 文字列
     */
    private final String text;

    /**
     * コンストラクタ
     */
    private MessageConst(final String text) {
        this.text = text;
    }
    /**
     * 値(文字列)取得
     */
    public String getMessage() {
        return this.text;
    }
}
