package springrestapii.demo.mapper;

import javax.annotation.processing.Generated;
import springrestapii.demo.dto.UserDto;
import springrestapii.demo.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-15T20:28:02+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class UserMappingImpl implements UserMapping {

    @Override
    public UserDto convertToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setEmail( user.getEmail() );

        return userDto;
    }

    @Override
    public User convertToJpa(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        user.setEmail( userDto.getEmail() );

        return user;
    }
}
