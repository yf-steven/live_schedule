package constants;

/**
 *
 * DB関連の項目値を定義するインターフェース
 * ※インターフェイスに定義した変数は public static final 修飾子がついているとみなされる
 *
 */
public interface JpaConst {

    // persistence-unit名
    String PERSISTENCE_UNIT_NAME = "live_schedule";

    // データ取得件数の最大値
    int ROW_PER_PAGE = 10; // 1ページに表示するレコードの数

    // ユーザーテーブル
    String TABLE_USER = "users"; // テーブル名

    // ユーザーテーブルカラム
    String USER_COL_ID = "id"; // id
    String USER_COL_EMAIL = "email"; // Eメール
    String USER_COL_NICKNAME = "nickname"; // 名前
    String USER_COL_PASS = "password"; // パスワード
    String USER_COL_ARTIST = "artist"; // お気に入りアーティスト
    String USER_COL_CREATED_AT = "created_at"; // 登録日時
    String USER_COL_UPDATED_AT = "updated_at"; // 更新日時

    // スケジュールテーブル
    String TABLE_SCHE = "schedules"; // テーブル名

    // スケジュールテーブルカラム
    String SCHE_COL_ID = "id"; // id
    String SCHE_COL_USER = "user_id"; // スケジュールを作成したユーザーのid
    String SCHE_COL_SCHE_DATE = "schedule_date"; // いつのスケジュールを示す日付
    String SCHE_COL_TITLE = "title"; // スケジュールのタイトル
    String SCHE_COL_ARTIST = "artist"; // アーティスト(バンド)名
    String SCHE_COL_PLACE = "place"; // 会場
    String SCHE_COL_MEMO = "memo"; // ライブ予定のメモ
    String SCHE_COL_CREATED_AT = "created_at"; // 登録日時
    String SCHE_COL_UPDATED_AT = "updated_at"; // 更新日時

    // Entity名
    String ENTITY_USER = "user"; // ユーザー
    String ENTITY_SCHE = "schedule"; // スケジュール

    // JPQL内パラメータ
    String JPQL_PARM_EMAIL = "email"; // Eメール
    String JPQL_PARM_PASSWORD = "password"; // パスワード
    String JPQL_PARM_USER = "user"; // ユーザー

    // NamedQueryのnameとquery
    // 全てのユーザーをidの降順に取得する
    String Q_USER_GET_ALL = ENTITY_USER + ".getAll"; // name
    String Q_USER_GET_ALL_DEF = "SELECT u FROM User AS u ORDER BY u.id DESC"; // query
    // 全てのユーザーの件数を取得する
    String Q_USER_COUNT = ENTITY_USER + ".count";
    String Q_USER_COUNT_DEF = "SELECT COUNT(u) FROM User AS u";
    // 全てのスケジュールをidの降順に取得する
    String Q_SCHE_GET_ALL = ENTITY_SCHE + ".getAll";
    String Q_SCHE_GET_ALL_DEF = "SELECT s FROM Schedule AS s ORDER BY s.id DESC";
    // 指定したユーザーが作成したスケジュールを全件idの降順に取得する
    String Q_SCHE_GET_ALL_MINE = ENTITY_SCHE + ".getAllMine";
    String Q_SCHE_GET_ALL_MINE_DEF = "SELECT s FROM Schedule AS s WHERE s.user = :" + JPQL_PARM_USER + " ORDER BY s.id DESC";
    // 指定したユーザーが作成したスケジュールの件数を取得する
    String Q_SCHE_COUNT_ALL_MINE = ENTITY_SCHE + ".countAllMine";
    String Q_SCHE_COUNT_ALL_MINE_DEF = "SELECT COUNT(s) FROM Schedule AS s WHERE s.user = :" + JPQL_PARM_USER;

}
