package 명함전송서버;

import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    String phoneNum;
    String email;
    String addr;

    public NameCard(String name, String phoneNum, String email, String addr) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
