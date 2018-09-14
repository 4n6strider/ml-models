package embedding;

import org.junit.Ignore;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.TestGraphDatabaseFactory;

import java.io.File;
import java.util.UUID;

/**
 * @author mh
 * @since 13.10.17
 */

public class TestDatabaseCreator {

    public static GraphDatabaseAPI createTestDatabase() {
        return (GraphDatabaseAPI)new TestGraphDatabaseFactory()
                .newImpermanentDatabaseBuilder(new File(UUID.randomUUID().toString()))
                .newGraphDatabase();
    }
}
