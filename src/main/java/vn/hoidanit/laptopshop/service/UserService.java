package vn.hoidanit.laptopshop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.hoidanit.laptopshop.domain.User; 
import java.util.List;


import vn.hoidanit.laptopshop.repository.userRepository;

@Service
public class UserService {
    @Autowired
    private userRepository userRepository;
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
