package com.bdqn.util;

import java.util.Properties;

public class DB {
    private String url;
    private String driver;
    private String userName;
    private String password;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DB{" +
                "url='" + url + '\'' +
                ", driver='" + driver + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", properties=" + properties +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
