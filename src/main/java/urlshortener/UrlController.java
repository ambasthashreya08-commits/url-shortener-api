package urlshortener;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class UrlController {

    private Map<String, String> urlMap = new HashMap<>();

    @GetMapping("/")
    public String home() {
        return "URL Shortener is running!";
    }

    @GetMapping("/shorten")
    public String shortenUrl(@RequestParam String url) {

        String shortCode = UUID.randomUUID()
                .toString()
                .substring(0, 6);

        urlMap.put(shortCode, url);

        return "http://localhost:8080/" + shortCode;
    }

    @GetMapping("/stats")
    public String stats() {
        return "Total URLs shortened: " + urlMap.size();
    }

    @GetMapping("/{code}")
    public ResponseEntity<Void> redirect(
            @PathVariable String code) {

        String originalUrl = urlMap.get(code);

        if (originalUrl == null) {
            return ResponseEntity.notFound().build();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", originalUrl);

        return ResponseEntity.status(302)
                .headers(headers)
                .build();
    }
}