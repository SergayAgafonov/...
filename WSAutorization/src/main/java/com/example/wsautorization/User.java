package com.example.wsautorization;

    public class User {
        private String name;
        private String family;
        private String login;
        private String password;

        public User(String name, String family, String login, String password){
            this.name = name;
            this.family = family;
            this.login = login;
            this.password = password;
        }

        public User() {

        }

        public String getname() {
            return name;
        }

        public void setname (String name) {
            this.name = name;
        }

        public String getfamily() {
            return family;
        }

        public void setfamily (String family) {
            this.family = family;
        }

        public String getlogin() {
            return login;
        }

        public void setlogin (String login) {
            this.login = login;
        }

        public String getpassword() {
            return password;
        }

        public void setpassword (String password) {
            this.password = password;
        }

    }