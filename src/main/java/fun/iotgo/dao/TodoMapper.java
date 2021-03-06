package fun.iotgo.dao;

import fun.iotgo.dto.TodoDto;
import fun.iotgo.entity.Todo;

import java.util.List;


public interface TodoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Todo record);

    int insertSelective(Todo record);

    Todo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Todo record);

    int updateByPrimaryKeyWithBLOBs(Todo record);

    int updateByPrimaryKey(Todo record);

    List<TodoDto> selectAllTodoList();
}