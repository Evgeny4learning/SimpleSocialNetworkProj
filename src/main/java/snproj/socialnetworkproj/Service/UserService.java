package snproj.socialnetworkproj.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import snproj.socialnetworkproj.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //tut sami zaprosi 4to mogno delat' s user
    //сохранять, считывать, искать по разным выборкам
}
