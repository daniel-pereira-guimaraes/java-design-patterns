package bridge_dao;

public class Application {
	
	public static void main(String[] args) {
		Person person = new Person(1L, "Emma");
		
		PersonDao mongoDao = new PersonMongoDao();
		PersonDao mySqlDao = new PersonMySqlDao();
		PersonDao oracleDao = new PersonOracleDao();
		
		PersonRestService restMongo = new PersonRestService(mongoDao);
		PersonRestService restMySql = new PersonRestService(mySqlDao);
		PersonRestService restOracle = new PersonRestService(oracleDao);
		
		PersonSoapService soapMongo = new PersonSoapService(mongoDao);
		PersonSoapService soapMySql = new PersonSoapService(mySqlDao);
		PersonSoapService soapOracle = new PersonSoapService(oracleDao);

		restMongo.save(person);
		restMySql.save(person);
		restOracle.save(person);

		soapMongo.save(person);
		soapMySql.save(person);
		soapOracle.save(person);
	}
	
}
