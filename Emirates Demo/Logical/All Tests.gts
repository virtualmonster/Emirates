<?xml version="1.0" encoding="UTF-8"?>
<editableResource createdTimestamp="1568196367236"
    createdUser="STUART.WALKER" id="-3bf281df:16d1c379711:-7add"
    type="test_suite_resource" updatedTimestamp="1689152479109"
    updatedUser="STUART.WALKER" version="1.0">
    <loggingConfiguration debug="false" resultWriterLoggingLevel="FULL" writeStubEventsToDB="true"/>
    <resourceConfig>
        <scenario continueOnFail="true" id="-3bf281df:16d1c379711:-7adc"
            type="scenario" version="1.0">
            <loggingConfiguration debug="false"
                resultWriterLoggingLevel="FULL" writeStubEventsToDB="false"/>
            <resourceConfig chkenv="false" name="Scenario"
                pacingtime="0.0" pacingtype="MIN_DURATION"
                parallel="false" slowfail="false" usepacing="false">
                <probesettings probeCoolDownTime="15"
                    probeCoolDownUnits="0" probeWarmUpTime="15" probeWarmUpUnits="0"/>
                <environmentTasks preventExecutionOnFailure="false"/>
            </resourceConfig>
            <testItem continueOnFail="true" disabled="true"
                id="3340513:16a1c54dd22:34fa"
                lkname="FlightBookingServices"
                lkpath="BookingServices/FlightBookingServices" type="test_suite_resource"/>
            <testItem continueOnFail="true" disabled="true"
                id="-13424e68:16b88a65fe0:-7114" lkname="FlightServices"
                lkpath="VBServices/WebSphere REST Services/FlightServices" type="test_suite_resource"/>
            <testItem continueOnFail="true" disabled="true"
                id="-2ac3f665:16a20df4699:cfb"
                lkname="HotelBookingServices"
                lkpath="VBServices/Tomcat Services/HotelFinder/getHotels/HotelBookingServices" type="test_suite_resource"/>
            <testItem continueOnFail="true"
                id="-443b4a73:18948fed2da:-4db9"
                lkname="Stuarts Hotel Request"
                lkpath="VBServices/Tomcat Services/HotelFinder/getHotels/Stuarts Hotel Request" type="test_resource"/>
            <testItem continueOnFail="true"
                id="-443b4a73:18948fed2da:-1df2"
                lkname="Stuarts hardcoded test"
                lkpath="VBServices/Tomcat Services/HotelFinder/getHotels/Stuarts hardcoded test" type="test_resource"/>
            <testItem continueOnFail="true"
                id="-443b4a73:18948fed2da:-6b"
                lkname="Stuarts Data Driven Test"
                lkpath="VBServices/Tomcat Services/HotelFinder/getHotels/Stuarts Data Driven Test" type="test_resource"/>
        </scenario>
    </resourceConfig>
</editableResource>
