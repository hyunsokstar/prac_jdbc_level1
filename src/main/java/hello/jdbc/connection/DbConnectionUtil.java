package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;

@Slf4j
public class DbConnectionUtil {
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // 연결 객체와 연결 객체의 타입 정보 확인
            log.info("get connection={}, class={}", connection, connection.getClass());

            return connection;
        } catch (SQLException e) {  // 예외에 관한 설명은 추후로 미룸
            throw new RuntimeException(e);
        }
    }
}
