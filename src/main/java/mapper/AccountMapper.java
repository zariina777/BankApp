package mapper;

import DTO.AccountDTO;
import entities.Account;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    @Named("toDto")
    AccountDTO mapToDTO(Account account);
    @Mapping(source = "id", target = "id")
    //@Mapping(source = "customer.dateOfBirth", target = "dateOfBirth")
    Account mapToEntity (AccountDTO accountDTO); //принимает ДТО и превращает в ентити

    @IterableMapping(qualifiedByName ="toDTO")
    List<AccountDTO> toDTOList(List<Account> accountList);

    @Named("stringToEnums")//данный метод будет использоваться для выполнения маппинга при преобразовании строки в перечисление (enum).
    default String converStringToEnum(String name) {return name.toUpperCase();

    }

}
