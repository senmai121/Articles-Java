package article.article;
// แก้ให้ตรงกับ package ของโปรเจกต์
import org.springframework.http.HttpMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    /*public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors() // เปิดใช้งาน CORS
            .and()
            .csrf().disable() // ปิด CSRF สำหรับ API (ถ้าจำเป็น)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll() // อนุญาต OPTIONS request ทุก endpoint
                .anyRequest().authenticated()
                
                // อื่น ๆ ต้องการการยืนยันตัวตน
                
            );
            
        return http.build();
    }*/
    
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors()
            .and()
            .csrf().disable()
            .authorizeHttpRequests()
            .anyRequest().authenticated() // 👈 ทุก request ต้อง login
            .and()
            .httpBasic(); // หรือ .formLogin() ถ้าใช้หน้า login

        return http.build();
    }
    /*public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .cors() // เปิดใช้งาน CORS
        .and()
        .csrf().disable()  // ปิด CSRF สำหรับ API (ในกรณีที่ใช้ `POST`)
        .authorizeHttpRequests()
        .requestMatchers("/่jobs*").authenticated()  // ให้ทุกคนที่ login แล้วสามารถใช้ได้
        .anyRequest().permitAll()  // กำหนดให้ทุก request อื่นสามารถเข้าถึงได้
        .and()
        .httpBasic(); // ใช้ Basic Auth

        return http.build();
    }*/
    
    
}
