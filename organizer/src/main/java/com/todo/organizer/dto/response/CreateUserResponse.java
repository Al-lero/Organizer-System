package com.todo.organizer.dto.response;

import com.todo.organizer.dto.request.CreateUserRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse  {
    private String message;
    private String id;

}
