package web;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// 문자를 암호화 변경을 하는 Module
public class encry_model {
    
    public String dataencode(String word) { // Base64 암호화
        Encoder ec = Base64.getEncoder();
        String security = ec.encodeToString(word.getBytes());
        return security;
    }
    
    public String datadecode(String word) { // Base64 복호화
        Decoder dc = Base64.getDecoder();
        String security = new String(dc.decode(word));
        return security;
    }
    
    // MD5 암호화 : %02x 기본 => %x => %03x ~ 자리수가 변경되는 사항 (x : 소문자, X : )
    // sha-1 : 16진수 40자로 생성되는 암호화 기술(%01x, %02x)
    // sha-224, sha-256, sha-384, sha-512
    
    // 복합 암호화 기술 => base64 => md5
    // 복합 암호화 기술(쌤 회사) => md5 + sha-2
    public String md5_encode(String word) {
        String security = "";
        try {
        	// MessageDigest : 암호화 클래스 구성 형태르 가지고 있는 라이브러리
            //MessageDigest md = MessageDigest.getInstance("MD5"); // 대소문자 수정
             MessageDigest md = MessageDigest.getInstance("sha3-256");
            md.update(word.getBytes()); // 해당 암호화 기준으로 byte로 문자를 변환
            byte md5byte[] = md.digest(); // 원시배열에 해당 암호화된 byte 저장
            
            StringBuilder sb = new StringBuilder(); // 문자열 클래스로 연속화
            for(byte s : md5byte) {
            	sb.append(String.format("%01x", s));
            	// %02x => 2자리 문자 => 1234 => 01,02,03,04
            	// %01x => 1자리 문자 => 1234 => 1,2,3,4
            	// %05x => 5자리 문자 => 1234 => 00001,00002,00003,00004
            }
            security = String.valueOf(sb);
        } catch (NoSuchAlgorithmException e) {
            security = "MD5 Error!!";
        }
        return security;
    }
}
