
package CONFIG;

public class Session {
    
    private static Session instance;
        
        private String user_id;
        private String u_fname;
        private String u_lname;
        private String email;
        private String contact;
        private String username;
        private String password;
        private String role;
        private String status;
        
        
        public Session(){
            
        }

    public static synchronized Session getInstance() {
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }
    

    
    public static boolean isinstanseEmpty() {
        return instance == null;
    }

     public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getU_fname() {
        return u_fname;
    }

    public void setU_fname(String u_fname) {
        this.u_fname = u_fname;
    }
    
     public String getU_lname() {
        return u_lname;
    }

    public void setU_lname(String u_lname) {
        this.u_lname = u_lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

        
}
