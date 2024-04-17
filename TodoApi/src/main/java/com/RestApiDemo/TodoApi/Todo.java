
package com.RestApiDemo.TodoApi;

public class Todo {


    private Boolean Completed;

    private int Id;

    private String Title;

    private int UserId;

    public Todo(int Id,String Title,int UserId,boolean Completed ){
        this.Id=Id;
        this.Title=Title;
        this.UserId=UserId;
        this.Completed=Completed;

    }
    public Boolean getCompleted() {
        return Completed;
    }

    public void setCompleted(Boolean completed) {
        Completed = completed;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
