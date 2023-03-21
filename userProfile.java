import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class userProfile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class userProfile extends World
{
    private int totalPoints;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    /**
     * Constructor for objects of class userProfile.
     * 
     */
    public userProfile(String first, String last, String user, String pass)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        this.firstName = first;
        this.lastName = last;
        this.username = user;
        this.password = pass;
    }
   
    //set first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    //get first name
    public String getFirstName(){
        return firstName;
    }
    
    //set last name
    public void setLastName(String LastName){
        this.firstName = LastName;
    }
    
    //get last name
    public String getLastName(){
        return lastName;
    }
    
    //set user name
    public void setUserName(String UserName){
        this.firstName = UserName;
    }
    
    //get user name
    public String getUserName(){
        return username;
    }
    
    //set password
    public void setPassword(String password){
        this.password = password;
    }
    
    //get password
    public String getPassword(){
        return password;
    }
}
