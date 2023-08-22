package com.todolist.services;

import com.todolist.Model.TodoClass;
import com.todolist.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;


	public void addnewtodo(TodoClass todoClass) {

		 todoRepository.save(todoClass);
	}

	public void DeletingTodo(int id) {
		todoRepository.deleteById(id);
	}

	public void deleteoldtodo(int id) {
		todoRepository.deleteById(id);
	}
}













//	static {
//		todos.add(new TodoClass(1,"ravikrpatel","ravikrpatel19@gmail.com","learning Spring Boot",LocalDate.now().plusMonths(1),false));
//		todos.add(new TodoClass(2,"ravikrpatel","ravikrpatel19@gmail.com","learning Spring Boot",LocalDate.now().plusMonths(1),false));
//		todos.add(new TodoClass(3,"ravikrpatel","ravikrpatel19@gmail.com","learning Spring Boot",LocalDate.now().plusMonths(1),false));
//		todos.add(new TodoClass(4,"ravikrpatel","ravikrpatel19@gmail.com","learning Spring Boot",LocalDate.now().plusMonths(1),false));
//
//	}