package com.todolist.Controller;

import com.todolist.Model.TodoClass;
import com.todolist.Repository.TodoRepository;
import com.todolist.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;
    @Autowired
    private TodoRepository todoRepository;
    @RequestMapping(value = "List-of-Todos",method = RequestMethod.GET)
    public String listoftodos(ModelMap model){
       List<TodoClass> todos= todoRepository.findAll();
        model.addAttribute("todos",todos);
        return "ListofAllTodos";
    }

    @RequestMapping(value = "AddNewTodo",method = RequestMethod.GET)
    public String ShowAddNewTodoPage(){
        return "AddNewTodo";
    }

    @RequestMapping(value = "AddNewTodo",method = RequestMethod.POST)
    public String AddNewTodoPage(@ModelAttribute TodoClass todoClass){
         todoService.addnewtodo(todoClass);
         return "redirect:List-of-Todos";
    }

    @RequestMapping(value = "DeleteTodo",method = RequestMethod.GET)
    public String DeleteTodo(@RequestParam int id){
        todoService.DeletingTodo(id);
        return "redirect:List-of-Todos";
    }

    @RequestMapping(value = "UpdateTodo",method = RequestMethod.GET)
    public String UpadteTodo(@RequestParam int id){
        todoService.deleteoldtodo( id);
        return "redirect:AddNewTodo";
    }
}
