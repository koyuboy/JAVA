
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
@ManagedBean
@RequestScoped
public class User {

    String name;
    String surname;
    String userName;
    String country;
    String gender;
    String e_mail;
    String password;
    boolean control_of_accept;   // hükmlülük yasal şeyleri kabul etme tiki

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public boolean isControl_of_accept() {
        return control_of_accept;
    }

    public void setControl_of_accept(boolean control_of_accept) {
        this.control_of_accept = control_of_accept;
    }

    public String goSignup() {
        return "signup?faces-redirect=true";
    }

    public String goLogin() {
        return "login?faces-redirect=true";
    }

    public String controlLogin() {  // database de  password ve username uyuşuyomu diye bakıcaz uyuşuyorsa mainPage ekranına yönlendir
        if ((userName.isEmpty()) || (password.isEmpty())) {
            return "login?faces-redirect=true";//"Username or password is empty!";
        }else {
            return "mainPage?faces-redirect=true";
        }
    }

    public String goForgotPassWord() {
        return "forgotPassword?faces-redirect=true";
    }

    public String controlForgot() { // database de  e-mail ve username uyuşuyomu diye bakıcaz uyuşuyorsa yeni şifre girme ekranına yönlendir
        if ((e_mail.isEmpty()) || (userName.isEmpty())) {
            return "forgotPassword?faces-redirect=true";//"Username or E-mail is empty!";
        } else {
            return "newPassword?faces-redirect=true";
        }
    }

    public String goNewPassWord() {
        return "newPassword?faces-redirect=true";
    }

    public String updatePassword() {   //databasede şifreyei güncellicez

        if (password.isEmpty()) {
            return "newPassword?faces-redirect=true";
        } else {
            return "login?faces-redirect=true";
        }
    }
    
    public String goProfile() {
        return "profile?faces-redirect=true";
    }
    
    public String goAccount() {
        return "account?faces-redirect=true";
    }
    
    
    public String updateAccount() {   //profil->account ||  burda yeni veri yazmış onları (!isEmpty()) ile olabilir mesela  konteol edip dataBase de güncellicez

        
        return "account?faces-redirect=true";   // başka returne gerek yok bu değişmicek, sadece buranın üstünded dataBase işlemelri olucak
    }
    
    public String goFriends() {
        return "friends?faces-redirect=true";
    }
    
    public String listFriends() {   //burda  web sayfasına dataBaseden arkadaşları çekip yazıcaz ama nasıl olucak bilmiyom :)
        return "1";
    }
    
    public String func(){
        return "<p style=\"background-color:yellow;width:200px;" +
 "padding:5px\">Name: " + getName() + "<br/>E-Mail: " +
 getE_mail() + "</p>";
    }
    

}
