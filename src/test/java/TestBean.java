import seven.anno.ExcelAnno;
import seven.util.RegHelper;

public class TestBean {

    @ExcelAnno(Value="时间")
    private String time;
    @ExcelAnno(Value="金额")
    private String money;
    @ExcelAnno(Value="在线人数")
    private String onlines;
    @ExcelAnno(Value="服务IP")
    private String services;
    @ExcelAnno(Value="地区")
    private String part;
    @ExcelAnno(Value="创建人")
    private String creatPerson;
    @ExcelAnno(Value="连接类型")
    private String linkType;
    @ExcelAnno(Value="岁数")
    private String age;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getOnlines() {
        return onlines;
    }

    public void setOnlines(String onlines) {
        this.onlines = onlines;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getCreatPerson() {
        return creatPerson;
    }

    public void setCreatPerson(String creatPerson) {
        this.creatPerson = creatPerson;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "time='" + time + '\'' +
                ", money='" + money + '\'' +
                ", onlines='" + onlines + '\'' +
                ", services='" + services + '\'' +
                ", part='" + part + '\'' +
                ", creatPerson='" + creatPerson + '\'' +
                ", linkType='" + linkType + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
