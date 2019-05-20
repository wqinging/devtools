package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：wqing
 * @date ：Created in 2019/3/11 0011 11:47
 */
public class DateUtil {

    private static final String STANDARD_DATE_TYPE = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";

    private static final String LONG_DATE_TYPE = "yyyy-MM-dd HH:mm:ss";

    private static final String SHORT_DATE_TYPE = "yyyy-MM-dd";

    private static final String YEAR_MONTH_TYPE = "yyyy-MM";

    private static final String Y_M_D_H_M_TYPE = "yyyy-MM-dd HH:mm";

    /**
     * 返回当前系统时间长时间格式字符串:年月日时分秒
     * @return
     */
    public static String getLongDateFormat() {
        Date vDate = new Date();
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(LONG_DATE_TYPE);
        String vFormat = vSimpleDateFormat.format(vDate);
        return vFormat;
    }


    /**
     * 返回长时间格式字符串:年月日时分秒
     * @return
     */
    public static String getLongDateFormat(Date pDate) {
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(LONG_DATE_TYPE);
        String vFormat = vSimpleDateFormat.format(pDate);
        return vFormat;
    }


    /**
     * 返回当前系统时间只有年和月的时间格式字符串
     *
     * @return
     */
    public static String getYearMonthDateFormat() {
        Date vDate = new Date();
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(YEAR_MONTH_TYPE);
        String vFormat = vSimpleDateFormat.format(vDate);
        return vFormat;
    }



    /**
     * 返回短时间日期格式:年月日
     *
     * @param pDate
     * @return
     * @throws ParseException
     */
    public static Date getShortDate(String pDate) throws ParseException {
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(SHORT_DATE_TYPE);
        Date vDate = vSimpleDateFormat.parse(pDate);
        return vDate;
    }

    /**
     * 返回短时间日期字符串:年月日
     *
     * @param pDate
     * @return
     * @throws ParseException
     */
    public static String getShortDateFormat(Date pDate) throws ParseException {
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(SHORT_DATE_TYPE);
        String format = vSimpleDateFormat.format(pDate);
        return format;
    }

    /**
     * 返回短时间日期格式:年月日时分
     *
     * @param pDate
     * @return
     * @throws ParseException
     */
    public static Date getYMDHMDate(String pDate) throws ParseException {
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(Y_M_D_H_M_TYPE);
        Date vDate = vSimpleDateFormat.parse(pDate);
        return vDate;
    }

    /**
     * 中国标准时间 转换成yyyy-MM-dd字符串
     *
     * @param pTime
     * @return
     * @throws ParseException
     */
    public static String getStandardDateFormatTOYMD(String pTime) throws ParseException {
           return getStandardDateFormat(pTime,SHORT_DATE_TYPE);
    }

    /**
     * 中国标准时间 转换成yyyy-MM-dd字符串
     *
     * @param pTime
     * @return
     * @throws ParseException
     */
    public static String getStandardDateFormatTOYMDHM(String pTime) throws ParseException {
        return getStandardDateFormat(pTime,Y_M_D_H_M_TYPE);
    }

    /**
     * 中国标准时间
     *
     * @param pTime
     * @return
     * @throws ParseException
     */
    public static String getStandardDateFormat(String pTime,String pType) throws ParseException {
        pTime = pTime.replace("Z", " UTC");
        SimpleDateFormat vSimpleDateFormat = new SimpleDateFormat(STANDARD_DATE_TYPE);
        Date vDate = vSimpleDateFormat.parse(pTime);
        SimpleDateFormat sdf = new SimpleDateFormat(pType);
        String vFormat = sdf.format(vDate);
        return vFormat;
    }


    /**
     * 获取当天的开始时间
     * @param pTime
     * @return
     * @throws ParseException
     */
    public static String getDayStart(String pTime) throws ParseException {
        return pTime+" 00:00:00";
    }

    /**
     * 获取当天的结束时间
     * @param pTime
     * @return
     * @throws ParseException
     */
    public static String getDayEnd(String pTime) throws ParseException {
        return pTime+" 23:59:59";
    }



}
