package com.example.demo.utils;


    public enum ResponseEnum {
        /**
         * =====================================
         * 0-99
         * =====================================
         */
        SUCCESS("true", "操作成功"),
        FAILURE("false", "操作失败"),
        UNKNOWN_ERROR("false", "未知错误");

        private String success;
        private String message;

        // 构造方法
        private ResponseEnum(String code, String message) {
            this.success = code;
            this.message = message;
        }
        public String getCode() {
            return success;
        }
        public String getMessage() {
            return message;
        }
    }
