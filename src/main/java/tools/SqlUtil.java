package tools;

/**
 * @author ：wqing
 * @date ：Created in 2019/3/18 0018 10:09
 */
public class SqlUtil {

    private final static String PAGE_SQL = "select * from( select rownum num, * from ( ${sql} ))where " +
            "num >=({pageIndex}-1)*{pageSize}+1 and num<={pageIndex}*{pageSize}";

    private final static String PAGE_COUNT_SQL = "select convert(int,count(1)) as num from ( ${sql} )";


    /**
     * 分页
     * @param sql
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public final static String getPageSql(String sql, String pageIndex, String pageSize) {
        return PAGE_SQL.replace("${sql}", sql)
                .replace("{pageIndex}", pageIndex)
                .replace("{pageSize}", pageSize);
    }

    /**
     * 总数
     * @param sql
     * @return
     */
    public final static String getPageCountSql(String sql) {
        return PAGE_COUNT_SQL.replace("${sql}", sql);
    }
}
