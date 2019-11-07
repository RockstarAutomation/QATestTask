package repository;


import org.apache.commons.lang3.RandomStringUtils;

public class SearchRepository {
    private static volatile SearchRepository instance = null;

    public static SearchRepository get() {
        if (instance == null) {
            synchronized (SearchRepository.class) {
                if (instance == null) {
                    instance = new SearchRepository();
                }
            }
        }
        return instance;
    }

    public Search getText() {
        return Search.builder()
                .search(RandomStringUtils.randomAlphabetic(5))
                .build();
    }

    public Search getDigits() {
        return Search.builder()
                .search(RandomStringUtils.randomNumeric(10))
                .build();
    }

    public Search getHugeText() {
        return Search.builder()
                .search(RandomStringUtils.randomAlphabetic(5000))
                .build();
    }

}
