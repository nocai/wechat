package com.wechat.api.result;

/**
 * AccessToken����ֵ
 * 
 * @author Jun.L
 *
 */
public class AccessTokenResult {
	private String access_token; // ��ȡ����ƾ֤ 
	private int expires_in; // ƾ֤��Чʱ�䣬��λ���� 

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	@Override
	public String toString() {
		return "AccessTokenResult [access_token=" + access_token
				+ ", expires_in=" + expires_in + "]";
	}

}