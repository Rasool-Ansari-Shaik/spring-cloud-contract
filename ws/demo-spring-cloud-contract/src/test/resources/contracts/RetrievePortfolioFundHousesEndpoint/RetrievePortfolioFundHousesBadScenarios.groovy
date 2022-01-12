/*package contracts.RetrievePortfolioFundHousesEndpoint

import org.springframework.cloud.contract.spec.Contract
[
	Contract.make {
		name("requestToRetrivePortfolioFundHousesWithMissingHeaderRequestReturnsBadRequest")
		request {
			method POST()
			urlPath('/investment/mutualfunds/fundhouses/inquiry')
			headers {
				contentType(applicationJson())
				header 'X-CorrelationId': $(consumer(nonBlank()), producer('124567890'))
				header 'X-Version': $(consumer('1.0'), producer('2.3.0'))
				header 'channelId': $(consumer(nonBlank()), producer('MBSG'))
			}
			body ([
				"portfolioId":$(anyNonBlankString())
			])
		}
		response {
			status BAD_REQUEST()
		}
	},
	Contract.make {
		name("requestWithInvalidURI")
		request {
			method POST()
			urlPath('/investment/mutualfunds/fundhouses/inquirys')
			headers {
				contentType(applicationJson())
				header 'X-CorrelationId': $(consumer(nonBlank()), producer('124567890'))
				header 'X-Version': $(consumer('1.0'), producer('2.3.0'))
				header 'channelId': $(consumer(nonBlank()), producer('MBSG'))
			}
		}
		response {
			status NOT_FOUND()
		}
	},
	Contract.make {
		name("requestToRetrievePortfolioFundHousesWithEmptyHeaderRequestReturnsBadRequest")
		request {
			method POST()
			urlPath('/investment/mutualfunds/fundhouses/inquiry')
			headers {
				contentType(applicationJson())
				header 'User-Agent'			: ''
				header 'X-CorrelationId'	: ''
				header 'authType'			: ''
				header 'X-Version'			: '2.3.0'
				header 'adobeId'			: ''
				header 'appVersion'			: ''
				header 'authorization'		: ''
				header 'locale'				: ''
				header 'longitude'			: ''
				header 'latitude'			: ''
				header 'channelId'			: ''
				header 'clientId'			: ''
				header 'customerId'			: ''
				header 'clientIpAddress'	: ''
				header 'deviceMake'			: ''
				header 'deviceModel'		: ''
				header 'deviceUuid'			: ''
				header 'osName'				: ''
				header 'userId'				: ''
			}
			body ([
				"portfolioId":$(anyNonBlankString())
			])
		}
		response {
			status BAD_REQUEST()
		}
	}
]*/