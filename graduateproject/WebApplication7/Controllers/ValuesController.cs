using DocumentFormat.OpenXml.Drawing.Charts;
using Microsoft.Azure.Management.Network.Fluent.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Cors;
using System.Web.ModelBinding;
using WebApplication7;

namespace WebApplication1.Controllers
{
    [EnableCors(origins: "*", headers: "*", methods: "*")]
    public class ValuesController : ApiController
    {
        //GET api/values
       // public IEnumerable<string> Get()
       // {
      //      return new string[] { "value1", "value2" };
       // }

        // GET api/values/5
        [HttpGet]
        
        public int Get(string permit, string quality, string health, string materials, string slope,
            string landtype
            , string landlocation, string elevator, int floor, string park
            , string propertycontract, string rebound
            , string pavedstreet, string streettype, string vitalcenter, string services, string streetnumber)
        {
      
            //withoutf delete
            using (ExpertSystemEntities entities = new ExpertSystemEntities())
            {
                int id = 2, pid = 1;
                //quality and health
                object qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitygood).FirstOrDefault();
                object heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthgood).FirstOrDefault();
                object mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                if (quality.Equals("good"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitygood).FirstOrDefault();
                    //decimal value for quality good from database
                    if (health.Equals("good"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthgood).FirstOrDefault();
                        //decimal value for health good from database
                        if (materials.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (materials.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (materials.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (materials.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }



                    }
                }
                if (quality.Equals("bad"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitybad).FirstOrDefault();
                    if (health.Equals("good"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthgood).FirstOrDefault();
                        if (materials.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (materials.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (materials.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (materials.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }


                    }
                }

                if (quality.Equals("good"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitygood).FirstOrDefault();
                    if (health.Equals("bad"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthbad).FirstOrDefault();
                        if (materials.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (materials.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (materials.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (materials.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }


                    }
                }
                if (quality.Equals("bad"))
                {
                    qual = entities.Attributes.Where(e => e.ID == id).Select(e => e.qualitybad).FirstOrDefault();
                    if (health.Equals("bad"))
                    {
                        heal = entities.Attributes.Where(e => e.ID == id).Select(e => e.healthbad).FirstOrDefault();
                        if (materials.Equals("blocks"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.blocks).FirstOrDefault();
                        }
                        else if (materials.Equals("natural"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.naturalstone).FirstOrDefault();
                        }
                        else if (materials.Equals("industrial"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.industrialstone).FirstOrDefault();
                        }
                        else if (materials.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneandinsulatingmaterials).FirstOrDefault();
                        }


                    }
                }
                //slope
                object sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.littleslope).FirstOrDefault();
                object lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                if (slope.Equals("little"))
                {
                    sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.littleslope).FirstOrDefault();
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.agriculturalland).FirstOrDefault();
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.sandland).FirstOrDefault();
                    }

                }
                if (slope.Equals("large"))
                {
                    sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.largeslope).FirstOrDefault();
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.agriculturalland).FirstOrDefault();
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.sandland).FirstOrDefault();
                    }
                }

                if (slope.Equals("midle"))
                {
                    sl = entities.Attributes.Where(e => e.ID == id).Select(e => e.midslope).FirstOrDefault();
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.stoneland).FirstOrDefault();
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.agriculturalland).FirstOrDefault();
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Where(e => e.ID == id).Select(e => e.sandland).FirstOrDefault();
                    }
                }
                //elevator
                object elv = entities.Attributes.Where(e => e.ID == id).Select(e => e.elevatorexist).FirstOrDefault();
                object floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.landfloar).FirstOrDefault();
                if (elevator.Equals("exist"))
                {
                    elv = entities.Attributes.Where(e => e.ID == id).Select(e => e.elevatorexist).FirstOrDefault();
                    if (floor == 1)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.landfloar).FirstOrDefault();
                    }
                    else if (floor == 3||floor == 2||floor == 4)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.midfloar).FirstOrDefault();
                    }
                    else if (floor == 5||floor == 6)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.upperfloar).FirstOrDefault();
                    }
                    else if (Convert.ToDouble(floor)<0.0)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.underlandfloar).FirstOrDefault();
                    }

                }
                if (elevator.Equals("notexist"))
                {
                    elv = entities.Attributes.Where(e => e.ID == id).Select(e => e.elavatornotexist).FirstOrDefault();
                    if (floor == 1)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.landfloar).FirstOrDefault();
                    }
                    else if (floor == 3||floor == 2||floor == 4)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.midfloar).FirstOrDefault();
                    }
                    else if (floor == 5||floor == 6)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.upperfloar).FirstOrDefault();
                    }
                    else if (floor <=0)
                    {
                        floarloc = entities.Attributes.Where(e => e.ID == id).Select(e => e.underlandfloar).FirstOrDefault();
                    }
                }
                //prices
                Double priceaverage = 310.0;
                //inside and outside 

                object locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.A).FirstOrDefault();
                    if (landlocation.Equals("A"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.A).FirstOrDefault();
                    }
                    else if (landlocation.Equals("B"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.B).FirstOrDefault();
                    }
                    else if (landlocation.Equals("C"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.C).FirstOrDefault();
                    }
                    else if (landlocation.Equals("D"))
                    {
                        locA = entities.Attributes.Where(e => e.ID == id).Select(e => e.D).FirstOrDefault();
                    }

                
                
                //paved rules
                object pav = entities.Attributes.Where(e => e.ID == id).Select(e => e.paved).FirstOrDefault();
                object strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.Residential).FirstOrDefault();
                object strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                object vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                object existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                if (pavedstreet.Equals("paved"))
                {
                    pav = entities.Attributes.Where(e => e.ID == id).Select(e => e.paved).FirstOrDefault();
                    if (streettype.Equals("residential"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.Residential).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }

                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                    else if (streettype.Equals("commerical"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.commerical).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                }
                else if (pavedstreet.Equals("unpaved"))
                {
                    pav = entities.Attributes.Where(e => e.ID == id).Select(e => e.unpaved).FirstOrDefault();
                    if (streettype.Equals("residential"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.Residential).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                    else if (streettype.Equals("commerical"))
                    {
                        strtype = entities.Attributes.Where(e => e.ID == id).Select(e => e.commerical).FirstOrDefault();
                        if (streetnumber.Equals("one"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.one).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.two).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.three).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Where(e => e.ID == id).Select(e => e.four).FirstOrDefault();
                            if (vitalcenter.Equals("proximity"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.proximity).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Where(e => e.ID == id).Select(e => e.far).FirstOrDefault();
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.existenceservices).FirstOrDefault();
                                }
                                else
                                {
                                    existserv = entities.Attributes.Where(e => e.ID == id).Select(e => e.lackservices).FirstOrDefault();
                                }
                            }

                        }
                    }
                }
                // parking
                object parking = entities.Attributes.Where(e => e.ID == id).Select(e => e.parkingexist).FirstOrDefault();
                if (park.Equals("exist"))
                {
                    parking = entities.Attributes.Where(e => e.ID == id).Select(e => e.parkingexist).FirstOrDefault();
                }
                else if (park.Equals("notexist"))
                {
                    parking = entities.Attributes.Where(e => e.ID == id).Select(e => e.parkingnotexist).FirstOrDefault();
                }
                // rebound
                object reb = entities.Attributes.Where(e => e.ID == id).Select(e => e.rebounds).FirstOrDefault();
                if (rebound.Equals("notexist"))
                {
                    reb = entities.Attributes.Where(e => e.ID == id).Select(e => e.rebounds).FirstOrDefault();
                }
                else if (rebound.Equals("exist"))
                {
                    reb = entities.Attributes.Where(e => e.ID == id).Select(e => e.reboundsexist).FirstOrDefault();
                }

                // propertycontract
                object proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.sorted).FirstOrDefault();
                if (propertycontract.Equals("sorted"))
                {
                    proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.sorted).FirstOrDefault();
                }
                else if (propertycontract.Equals("romured"))
                {
                    proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.romured).FirstOrDefault();
                }
                else if (propertycontract.Equals("financial"))
                {
                    proper = entities.Attributes.Where(e => e.ID == id).Select(e => e.financial).FirstOrDefault();
                }

                // rent
               

                //permit
                object permitbuild = entities.Attributes.Where(e => e.ID == id).Select(e => e.buildingpermitexist).FirstOrDefault();
                if (permit.Equals("exist"))
                {

                    permitbuild = entities.Attributes.Where(e => e.ID == id).Select(e => e.buildingpermitexist).FirstOrDefault();
                }
                else if (permit.Equals("notexist"))
                {
                    permitbuild = entities.Attributes.Where(e => e.ID == id).Select(e => e.buildingpermitnotexist).FirstOrDefault();
                }



                object x = (Convert.ToDouble(proper)-9.0000)/9.0000 + (Convert.ToDouble(parking)-4.2857)/4.2857 + (Convert.ToDouble(pav)-8.2857)/8.2857 + (Convert.ToDouble(strnumber)-6.8571)/6.8751 + (Convert.ToDouble(strtype)-6.5714)/6.5714 + (Convert.ToDouble(vita)-5.5714)/5.5714 + (Convert.ToDouble(existserv)-9.0000)/9.0000 + (Convert.ToDouble(permitbuild)-8.1429)/8.1429 + (Convert.ToDouble(locA)-7.8571)/7.8571 + (Convert.ToDouble(elv)-8.8571)/8.8571 + (Convert.ToDouble(floarloc)-7.7143)/7.7143 +( Convert.ToDouble(sl)-2.4286)/2.4286 + (Convert.ToDouble(lands)-2.0000)/2.0000 + (Convert.ToDouble(qual)-8.4285)/8.4285 +( Convert.ToDouble(heal)-7.5714)/7.5714 + (Convert.ToDouble(mat)-7.8571)/7.8571 + (Convert.ToDouble(reb)-7.8571)/7.8571;
               // متوسط المساحة للشقق
               // Double  meter = 150.0;
                //عدد الأسئلة
                Double r = 17.0;
                x = Convert.ToDouble(x) / r;
                //priceaverage = priceaverage /meter;
                Double finalprice = priceaverage +( priceaverage * Convert.ToDouble(x));
               // x = Convert.ToDouble(x) * Convert.ToDouble(priceaverage);
               // range results 201-394
                return Convert.ToInt32(finalprice);
            }
        }

        // POST api/values
        public void Post([FromBody] string value)
        {
        }

        // PUT api/values/5
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/values/5
        public void Delete(int id)
        {
        }
    }
}
