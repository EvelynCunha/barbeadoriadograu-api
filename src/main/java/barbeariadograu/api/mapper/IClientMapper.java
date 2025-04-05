package barbeariadograu.api.mapper;

import barbeariadograu.api.controller.request.SaveClientRequest;
import barbeariadograu.api.controller.request.UpdateClientRequest;
import barbeariadograu.api.controller.response.ClientDetailResponse;
import barbeariadograu.api.controller.response.ListClientResponse;
import barbeariadograu.api.controller.response.SaveClientResponse;
import barbeariadograu.api.controller.response.UpdateClientResponse;
import barbeariadograu.api.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
