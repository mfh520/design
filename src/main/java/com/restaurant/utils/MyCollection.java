package com.restaurant.utils;


import org.apache.log4j.Logger;

import java.util.*;

/**
 * @author lihaimeng
 * @date 2019/1/13
 *
 * 容器工具类
 */
public class MyCollection {
    private static final Logger logger = Logger.getLogger(MyCollection.class);

    public static <E> LinkedList<E> setToLinkedList(Set<E> set) {
        if (set == null) {
            logger.error("input set is null.");
        }
        LinkedList<E> linkedList = new LinkedList<E>();
        linkedList.addAll(set);
        return linkedList;
    }

    public static <E> LinkedList<E> collectionToLinkedList(Collection<E> collection) {
        if (collection == null) {
            logger.error("input collection is null.");
        }
        LinkedList<E> linkedList = new LinkedList<E>();
        linkedList.addAll(collection);
        return linkedList;
    }

    // 将map.value 按照String.CASE_INSENSITIVE_ORDER规则，通过map.key进行排序
    public static <E> LinkedList<E> mapValueToLinkedlist(Map<String, E> map) {
        if (map == null) {
            logger.error("input map is null.");
        }
        List<String> keyList = setToLinkedList(map.keySet());
        keyList.sort(String.CASE_INSENSITIVE_ORDER);
        LinkedList<E> linkedList = new LinkedList<E>();
        for (String key : keyList) {
            linkedList.add(map.get(key));
        }
        return linkedList;
    }

    public static <E> LinkedList<E> listToLinkedList(List<E> list) {
        if (list == null) {
            logger.error("input list is null.");
        }
        LinkedList<E> linkedList = new LinkedList<E>();
        linkedList.addAll(list);
        return linkedList;
    }
}
