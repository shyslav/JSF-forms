package models;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author shyshkin_vlad
 * @param name имя
 * @param surname фамилия
 * @param country страна
 * @param sex пол
 * @param sexSelector перечень пола
 * @param language язык
 */
@ManagedBean(name = "User")
public class User {
    private String name;
    private String surname;
    private String age;
    private String country;
    private String sex;
    private String language;
    List<String> sexSelector;
    
    public User(){
        sexSelector = new ArrayList<>();
        sexSelector.add("male");
        sexSelector.add("female");
    }
    
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getSexSelector() {
        return sexSelector;
    }    

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }    

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public void check()
    {
        FacesContext faces = FacesContext.getCurrentInstance();
        if(name.equals(surname))
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"\"Error. Username and surname are the same\"",null));
        }
        else
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Great!",null));
        }
    }
}
