package com.alex.api.exception.core;

/****
 * 通用的异常代码接口。 该接口规约为，所有异常，以一个异常代码，和异常描述信息组成。
 *
 */
public interface IErrorCode {
    /****
     * 获取异常代码。
     *
     * @return
     */
    String getErrorCode();

    /****
     * 获取异常描述信息。
     *
     * @return
     */
    String getErrorMsg();
}
