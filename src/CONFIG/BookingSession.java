
package CONFIG;

public class BookingSession {
    
            private static BookingSession instance;
            private String c_id;
            private String c_fname;
            private String c_lname;
            private String c_address;
            private String c_email;
            private String c_contact;


            private String p_id;
            private String p_fname;
            private String p_lname;
            private String p_email;
            private String p_contact;
            private String p_experience;
            private String p_expertise;
            private String p_rate;
            private String p_status;

            private String pp_id;
            private String pp_name;
            private String pp_price;
            private String pp_desc;
            private String pp_service;
            private String pp_duration;
            
            
            private String b_id;
            private String event_time;
            private String reception;
            private String event_date;
            private String payment_method;
            private String total_amount;
            private String downpayment;
            private String sukli;
            private String balance;
            private String status;
            private String created_at;

      
    
    public BookingSession(){
   
}

         public static synchronized BookingSession getInstance() {
        if (instance == null) {
            instance = new BookingSession();
        }
        return instance;
    }

        public static void setInstance(BookingSession instance) {
            BookingSession.instance = instance;
        }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public String getC_contact() {
        return c_contact;
    }

    public void setC_contact(String c_contact) {
        this.c_contact = c_contact;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public String getP_contact() {
        return p_contact;
    }

    public void setP_contact(String p_contact) {
        this.p_contact = p_contact;
    }

    public String getP_experience() {
        return p_experience;
    }

    public void setP_experience(String p_experience) {
        this.p_experience = p_experience;
    }

    public String getP_expertise() {
        return p_expertise;
    }

    public void setP_expertise(String p_expertise) {
        this.p_expertise = p_expertise;
    }

    public String getP_status() {
        return p_status;
    }

    public void setP_status(String p_status) {
        this.p_status = p_status;
    }

    public String getPp_id() {
        return pp_id;
    }

    public void setPp_id(String pp_id) {
        this.pp_id = pp_id;
    }

    public String getPp_desc() {
        return pp_desc;
    }

    public void setPp_desc(String pp_desc) {
        this.pp_desc = pp_desc;
    }

    public String getPp_service() {
        return pp_service;
    }

    public void setPp_service(String pp_service) {
        this.pp_service = pp_service;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(String downpayment) {
        this.downpayment = downpayment;
    }

    public String getSukli() {
        return sukli;
    }

    public void setSukli(String sukli) {
        this.sukli = sukli;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getC_fname() {
        return c_fname;
    }

    public void setC_fname(String c_fname) {
        this.c_fname = c_fname;
    }

    public String getC_lname() {
        return c_lname;
    }

    public void setC_lname(String c_lname) {
        this.c_lname = c_lname;
    }

    public String getP_fname() {
        return p_fname;
    }

    public void setP_fname(String p_fname) {
        this.p_fname = p_fname;
    }

    public String getP_lname() {
        return p_lname;
    }

    public void setP_lname(String p_lname) {
        this.p_lname = p_lname;
    }

    public String getP_rate() {
        return p_rate;
    }

    public void setP_rate(String p_rate) {
        this.p_rate = p_rate;
    }

    public String getPp_name() {
        return pp_name;
    }

    public void setPp_name(String pp_name) {
        this.pp_name = pp_name;
    }

    public String getPp_price() {
        return pp_price;
    }

    public void setPp_price(String pp_price) {
        this.pp_price = pp_price;
    }

    public String getPp_duration() {
        return pp_duration;
    }

    public void setPp_duration(String pp_duration) {
        this.pp_duration = pp_duration;
    }

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getEvent_time() {
        return event_time;
    }

    public void setEvent_time(String event_time) {
        this.event_time = event_time;
    }

    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
        
   
}
    
        
    



