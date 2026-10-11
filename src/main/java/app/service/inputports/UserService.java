package app.service.inputports;

import app.domain.User;

import java.util.List;

public interface UserService {

    public User create(Integer id, String name, String lastName, String email, String phone, String password, String state, String city, String preferences);
    public User selectById(int id);          // antes void
    public List<User> selectUsers();
    public User update(Integer id, String name, String lastName, String email, String phone, String password, String state, String city, String preferences);  // antes update() void sin parámetros
    public boolean deleteUser(int id);       // antes void
    public int countUsers();                 // NUEVO
}
