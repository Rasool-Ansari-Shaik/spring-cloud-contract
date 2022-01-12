/*package contracts.RetrievePortfolioFundHousesEndpoint

import org.springframework.cloud.contract.spec.Contract
[
	Contract.make {
		name("requestToRetrieveFundHousesWithMandatoryHeadersReturnOk")
		request {
			method POST()
			urlPath('/investment/mutualfunds/fundhouses/inquiry')
			headers {
				contentType(applicationJson())
				header 'X-CorrelationId': $(consumer(nonBlank()), producer('124567890'))
				header 'X-Version': $(consumer('1.0'), producer('2.3.0'))
				header 'channelId': $(consumer(nonBlank()), producer('1224555677'))
				header 'customerId': $(consumer(nonBlank()), producer('4567788544'))
				header 'clientId': $(consumer(nonBlank()), producer('764421788'))
			}
			body ([
				"portfolioId":$(anyNonBlankString())
			])
		}
		response {
			status OK()
			body ([
				fundHouses : [
					[
						key		: $(anyNonBlankString()),				
						value	: $(anyNonBlankString()),
						order	: $(anyNonBlankString())
					]
				]
			])
			headers {
				contentType(applicationJson())
				header 'serverDateTime': $(anyNonBlankString())
			}
		}
	}, 
	Contract.make {
		name("requestToRetrieveFundHousesWithAllHeadersReturnOk")
		request {
			method POST()
			urlPath('/investment/mutualfunds/fundhouses/inquiry')
			headers {
				contentType(applicationJson())
				header 'User-Agent'			: $(anyNonBlankString())
				header 'X-CorrelationId'	: $(consumer(nonBlank()), producer('124456677'))
				header 'X-Version'			: $(consumer('1.0'), producer('2.3.0'))
				header 'authType'			: $(anyNonBlankString())
				header 'adobeId'			: $(anyNonBlankString())
				header 'appVersion'			: $(anyNonBlankString())
				header 'authorization'		: $(anyNonBlankString())
				header 'locale'				: $(anyNonBlankString())
				header 'longitude'			: $(anyNonBlankString())
				header 'latitude'			: $(anyNonBlankString())
				header 'channelId'			: $(consumer(nonBlank()), producer('256788999'))
				header 'clientId'			: $(consumer(nonBlank()), producer('452671889'))
				header 'customerId'			: $(consumer(nonBlank()), producer('765447778'))
				header 'clientIpAddress'	: $(anyNonBlankString())
				header 'deviceMake'			: $(anyNonBlankString())
				header 'deviceModel'		: $(anyNonBlankString())
				header 'deviceUuid'			: $(anyNonBlankString())
				header 'osName'				: $(anyNonBlankString())
				header 'userId'				: $(anyNonBlankString())
			}
			body ([
				"portfolioId": $(anyNonBlankString())
			])
		}
		response {
			status OK()
			body ([
				fundHouses : [
					[
						key		: $(anyNonBlankString()),				
						value	: $(anyNonBlankString()),
						order	: $(anyNonBlankString())
					]
				]
			])
			headers {
				contentType(applicationJson())
				header 'serverDateTime': $(anyNonBlankString())
			}
		}
	}
]*/