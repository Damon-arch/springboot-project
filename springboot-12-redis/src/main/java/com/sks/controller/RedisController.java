package com.sks.controller;

import com.sks.pojo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {
    @Resource
    private RedisTemplate<String, String> redisTemplate;
    
    @Resource
    private RedisTemplate<Object, Object> objectRedisTemplate;
    
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    
    @PostMapping("/redis/add")
    public String add(String name, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(name, value);
        return "向 Redis 中添加了数据";
    }
    
    @GetMapping("/redis/get/{key}")
    public String get(@PathVariable("key") String key) {
        String s = redisTemplate.opsForValue().get(key);
        return "您得到的数据是：" + s;
    }
    
    @PostMapping("/redis/{k}/{v}")
    public String set(@PathVariable("k") String k, @PathVariable("v") String v) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(k, v);
        return "成功";
    }
    
    @PostMapping("/redis/string/{k}/{v}")
    public String setString(@PathVariable("k") String k, @PathVariable("v") String v) {
        stringRedisTemplate.opsForValue().set(k, v);
        return "success";
    }
    
    @PostMapping("/redis")
    public String setObject() {
        objectRedisTemplate.opsForValue().set("s1", new Student());
        return "成功了！";
    }
}
