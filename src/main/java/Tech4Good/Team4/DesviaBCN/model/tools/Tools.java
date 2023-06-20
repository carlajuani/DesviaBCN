package Tech4Good.Team4.DesviaBCN.model.tools;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class Tools {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
