package com.example.demo.model;

import javax.persistence.*;

    @Entity
    @Table(name = "clients")
    public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String surname;
        private Branch branch;

        public Client() {
        }

        public int getId() {
            return id;
        }

        public void setId(final int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        void setName(final String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        void setSurname(final String surname) {
            this.surname = surname;
        }

        public Branch getBranch() {
            return branch;
        }

        void setBranch(final Branch branch) {
            this.branch = branch;
        }
    }
