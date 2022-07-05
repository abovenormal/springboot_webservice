package com.david.book.springboot.web.dto;

import com.david.book.springboot.web.dto.HelloResponseDto;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_func_test(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);


    }
}
