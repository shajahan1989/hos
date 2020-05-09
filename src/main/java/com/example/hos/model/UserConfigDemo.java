package com.example.hos.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="config")
public class UserConfigDemo {

    private String host;

    private String port;

    private String UserName;

    private ThirdParty thirdParty;

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ThirdParty getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(ThirdParty thirdParty) {
        this.thirdParty = thirdParty;
    }

    public void setHost(String host) {
        this.host = host;
    }


    @Override
    public String toString() {
        return "UserConfigDemo{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", UserName='" + UserName + '\'' +
                ", thirdParty=" + thirdParty +
                '}';
    }

    private static class ThirdParty{
        private String host;

        private String port;

        private String name;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "ThirdParty{" +
                    "host='" + host + '\'' +
                    ", port='" + port + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}
