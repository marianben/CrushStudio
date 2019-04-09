package crushstudio.crush_studio.config.mapper;

import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapper {
    private static ModelMapper modelMapper;

    public <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream().map(entity -> map(entity, outCLass)).collect(Collectors.toList());
    }

    private Mapper() {
    }
    public <D, T> D map(final T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }
}
