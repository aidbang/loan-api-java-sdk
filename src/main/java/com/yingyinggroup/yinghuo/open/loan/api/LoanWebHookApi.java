package com.yingyinggroup.yinghuo.open.loan.api;

import com.yingyinggroup.yinghuo.open.loan.LoanApiClient;
import com.yingyinggroup.yinghuo.open.loan.request.BankCardBindingNotificationDTO;
import com.yingyinggroup.yinghuo.open.loan.response.NotificationResponseDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * Created by jun.wu on 2017/8/09.
 * 聚合Api
 */
public interface LoanWebHookApi extends LoanApiClient.Api {

    /**
     * 确认绑卡状态通知
     *
     * @return
     */
    @RequestLine("POST /open-api/loan-market/merchant/bank_card_bind_notification")
    @Headers("Content-Type: application/json")
    NotificationResponseDTO notifyBankCardBindStatus(BankCardBindingNotificationDTO bankCardBindingNotificationDTO);


}
